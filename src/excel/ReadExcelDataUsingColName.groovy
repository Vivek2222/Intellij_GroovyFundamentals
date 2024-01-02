package excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ReadExcelDataUsingColName {

    static main(args) {

        def fis = new FileInputStream("./src/Files/TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        def row = sheet.getRow(0)

        def colNum = -1

        for (i in 0..row.getLastCellNum() - 1) {
            if (row.getCell(i).getStringCellValue().trim() == "PassWord")
                colNum = i
        }

        row = sheet.getRow(1)
        def cell = row.getCell(colNum)

        def userName = cell.getStringCellValue()
        println("UserName from Excel is: $userName")

        println("---------------------------------")

        def eat = new ExcelApiTest("./src/Files/TestData.xlsx")

        userName = eat.getCellData("Credentials", "UserName", 2)
        println("UserName from Excel is: $userName")

        int noOfAttempts = eat.getCellData("Credentials", "NoOfAttempts", 2)
        println("NoOfAttempts from Excel is: $noOfAttempts")

        def dateCreated = eat.getCellData("Credentials", "DateCreated", 3)
        println("DateCreated from Excel is: $dateCreated")
    }
}
