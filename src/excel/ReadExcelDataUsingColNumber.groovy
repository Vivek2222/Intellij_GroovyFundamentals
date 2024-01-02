package excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ReadExcelDataUsingColNumber {

    static void main(String[] args) {
        def fis = new FileInputStream("./src/Files/TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        def row = sheet.getRow(1)
        def cell = row.getCell(0)

        def userName = cell.getStringCellValue()
        println("UserName from Excel Sheet is: $userName")

        cell = row.getCell(3)

        def noOfAttempts = cell.getNumericCellValue()
        println("NoOfAttempts from Excel Sheet is: $noOfAttempts")

        cell = row.getCell(2)

        def dateCreated = cell.getDateCellValue()
        println("DateCreated from Excel Sheet is: $dateCreated")

        println("---------------------------------")

        def eat = new ExcelApiTest("./src/Files/TestData.xlsx")

        userName = eat.getCellData("Credentials", 1, 2)
        println("UserName from Excel Sheet is: $userName")

        noOfAttempts = eat.getCellData("Credentials", 4, 2)
        println("NoOfAttempts from Excel Sheet is: $noOfAttempts")

        dateCreated = eat.getCellData("Credentials", 3, 2)
        println("DateCreated from Excel Sheet is: $dateCreated")

    }
}
