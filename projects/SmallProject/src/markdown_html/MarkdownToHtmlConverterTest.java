package markdown_html;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkdownToHtmlConverterTest {

    private final MarkdownToHtmlConverter converter = new MarkdownToHtmlConverter();

    @Test
    public void testHeaderConversion() {
        String markdown = "# Header 1\n## Header 2\n### Header 3";
        String expectedHtml = "<h1>Header 1</h1>\n<h2>Header 2</h2>\n<h3>Header 3</h3>\n";
        assertEquals(expectedHtml, converter.convert(markdown));
    }

    @Test
    public void testListConversion() {
        String markdown = "- Item 1\n- Item 2\n- Item 3";
        String expectedHtml = "<ul>\n<li>Item 1</li>\n<li>Item 2</li>\n<li>Item 3</li>\n</ul>\n";
        assertEquals(expectedHtml, converter.convert(markdown));
    }

    @Test
    public void testNestedListConversion() {
        String markdown = "- Item 1\n  - Subitem 1.1\n  - Subitem 1.2\n- Item 2";
        String expectedHtml = "<ul>\n<li>Item 1\n<ul>\n<li>Subitem 1.1</li>\n<li>Subitem 1.2</li>\n</ul></li>\n<li>Item 2</li>\n</ul>\n";
        assertEquals(expectedHtml, converter.convert(markdown));
    }

    @Test
    public void testLinkConversion() {
        String markdown = "[Link](http://example.com)";
        String expectedHtml = "<a href=\"http://example.com\">Link</a>";
        assertEquals(expectedHtml, converter.convert(markdown));
    }

    @Test
    public void testImageConversion() {
        String markdown = "![Alt Text](http://example.com/image.png)";
        String expectedHtml = "<img src=\"http://example.com/image.png\" alt=\"Alt Text\" />";
        assertEquals(expectedHtml, converter.convert(markdown));
    }

    @Test
    public void testMixedContentConversion() {
        String markdown = "# Header\n- Item 1\n- Item 2\n[Link](http://example.com)\n![Image](http://example.com/image.png)";
        String expectedHtml = "<h1>Header</h1>\n<ul>\n<li>Item 1</li>\n<li>Item 2</li>\n</ul>\n<a href=\"http://example.com\">Link</a>\n<img src=\"http://example.com/image.png\" alt=\"Image\" />";
        assertEquals(expectedHtml, converter.convert(markdown));
    }

    @Test
    public void testEmptyInput() {
        String markdown = "";
        String expectedHtml = "";
        assertEquals(expectedHtml, converter.convert(markdown));
    }

    @Test
    public void testHeaderWithExtraSpaces() {
        String markdown = "#  Header  \n##  Subheader  ";
        String expectedHtml = "<h1>Header</h1>\n<h2>Subheader</h2>\n";
        assertEquals(expectedHtml, converter.convert(markdown));
    }
}

