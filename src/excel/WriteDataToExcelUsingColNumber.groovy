package excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class WriteDataToExcelUsingColNumber {

    static main(args) {

        def fis = new FileInputStream("./src/Files/TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        def row = sheet.getRow(1)

        if (row == null)
            row = sheet.createRow(1)

        def cell = row.getCell(4)

        if (cell == null)
            cell = row.createCell(4)

        cell.setCellValue("Pass")

        def fos = new FileOutputStream("./src/Files/TestData.xlsx")
        workbook.write(fos)
        fos.close()

        println("Sucess...")

        println("--------------------------")

        def eat = new ExcelApiTest("./src/Files/TestData.xlsx")
        eat.setCellData("Credentials", 4, 1, "Fail")
        println("Sucess...")

    }
}
