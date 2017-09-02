import com.itextpdf.text.*;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class ItextPdf1 {

    public static void main(String[] args) {

        //创建文档对象
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);

        try {

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\ITextTest.pdf"));

            document.open();

            Anchor anchorTarget = new Anchor("First page of the document.");
            anchorTarget.setName("BackToTop");
            Paragraph paragraph1 = new Paragraph();

            paragraph1.setSpacingBefore(50);

            paragraph1.add(anchorTarget);
            document.add(paragraph1);

            document.add(new Paragraph("mother fucker",

                    FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD,	new CMYKColor(0, 255, 0, 0))));

            document.close();

            //不支持中文






        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
