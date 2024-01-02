package excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class WriteDataToExcelUsingColName {

    static main(args) {

        def fis = new FileInputStream("./src/Files/TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        def colNum = -1

        def row = sheet.getRow(0)

        for (i in 0..row.getLastCellNum() - 1) {
            if (row.getCell(i).getStringCellValue().trim() == "Result")
                colNum = i
        }

        row = sheet.getRow(1)

        if (row == null)
            row = sheet.createRow(1)

        def cell = row.getCell(colNum)

        if (cell == null)
            cell = row.createCell(colNum)

        cell.setCellValue("FAIL")

        def fos = new FileOutputStream("./src/Files/TestData.xlsx")
        workbook.write(fos)
        fos.close()

        println("Sucess...")

        println("-----------------")

        def eat = new ExcelApiTest("./src/Files/TestData.xlsx")
        eat.setCellData("Credentials", "Result", 2, "PASS")

        println("Sucess...")
    }
}
