package excel

import org.apache.poi.xssf.usermodel.XSSFWorkbook

class RowAndColumnCount {

    static void main(String[] args) {
        def fis = new FileInputStream("./src/Files/TestData.xlsx")
        def workbook = new XSSFWorkbook(fis)
        def sheet = workbook.getSheet("Credentials")

        def row = sheet.getRow(0)
        def colCount = row.getLastCellNum()

        println("Column Count is : $colCount")

        def rowCount = sheet.getLastRowNum() + 1

        println("Row Count is : $rowCount")

        println("---------------------------------")

        def eat = new ExcelApiTest("./src/Files/TestData.xlsx")

        println("Column Count is : ${eat.getColumnCount("Credentials")}")
        println("Row Count is : ${eat.getRowCount("Credentials")}")
    }
}
