package com.test.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.stream.Stream;

public class TableUtils {

    public static void addTable(Document document, int column) throws DocumentException, IOException, URISyntaxException {
        PdfPTable table = new PdfPTable(column);
        addTableHeader(table,false);
        addRows(table);


        //addCustomRows(table);
        //PDFGenerator.addEmptyLine(new Paragraph(),1);



        document.add(table);
       /* DottedLineSeparator separator = new DottedLineSeparator();
        separator.setPercentage(59500f / 523f);*/
        //Chunk linebreak = new Chunk(separator);
        document.add( Chunk.NEWLINE );
        //document.add(linebreak);
        table = new PdfPTable(column);
        addTableHeader(table,true);
        addRows(table);

        document.add( Chunk.NEWLINE );document.add(table);
       // return document;
    }

    private static void addTableHeader(PdfPTable table,boolean head) {
        if(head) {
            Stream.of("Bill to Party", "Ship to Party")
                    .forEach(columnTitle -> {
                        PdfPCell header = new PdfPCell();
                        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                        header.setBorderWidth(2);
                        header.setPhrase(new Phrase(columnTitle));
                        header.setVerticalAlignment(Element.ALIGN_CENTER);
                        header.setHorizontalAlignment(Element.ALIGN_CENTER);
                        table.addCell(header);
                    });
        }
    }

    private static void addCustomRows(PdfPTable table)
            throws URISyntaxException, BadElementException, IOException {
        //Path path = Paths.get(ClassLoader.getSystemResource("Java_logo.png").toURI());
        //Image img = Image.getInstance(path.toAbsolutePath().toString());
        //img.scalePercent(10);

        //PdfPCell imageCell = new PdfPCell(img);
        //table.addCell(imageCell);

        PdfPCell horizontalAlignCell = new PdfPCell(new Phrase("row 2, col 2"));
        horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(horizontalAlignCell);

        PdfPCell verticalAlignCell = new PdfPCell(new Phrase("row 2, col 3"));
        verticalAlignCell.setVerticalAlignment(Element.ALIGN_BOTTOM);
        table.addCell(verticalAlignCell);
    }
    private static void addRows(PdfPTable table) {
        table.addCell("Invoice No: "+"11111");
        table.addCell("Transport Mode: ");
        //table.addCell("row 1, col 3");
    }

    public static void createTable(Document document,int column)
            throws DocumentException {
        PdfPTable table = new PdfPTable(column);

        // t.setBorderColor(BaseColor.GRAY);
        // t.setPadding(4);
        // t.setSpacing(4);
        // t.setBorderWidth(1);

        PdfPCell c1 = new PdfPCell(new Phrase("Table Header 1"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 2"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 3"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        table.setHeaderRows(1);

        table.addCell("1.0");
        table.addCell("1.1");
        table.addCell("1.2");
        table.addCell("2.1");
        table.addCell("2.2");
        table.addCell("2.3");

        System.out.println("content table created");
        document.add(table);

    }

}
