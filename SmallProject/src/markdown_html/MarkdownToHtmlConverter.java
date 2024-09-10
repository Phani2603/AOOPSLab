package markdown_html;

import java.util.Stack;

public class MarkdownToHtmlConverter {

    public String convert(String markdown) {
        String html = markdown;
        html = convertHeaders(html);
        html = convertLists(html);
        html = convertLinksAndImages(html);
        return html;
    }

    private String convertHeaders(String markdown) {
        return markdown
            .replaceAll("(?m)^###### (.*?)$", "<h6>$1</h6>")
            .replaceAll("(?m)^##### (.*?)$", "<h5>$1</h5>")
            .replaceAll("(?m)^#### (.*?)$", "<h4>$1</h4>")
            .replaceAll("(?m)^### (.*?)$", "<h3>$1</h3>")
            .replaceAll("(?m)^## (.*?)$", "<h2>$1</h2>")
            .replaceAll("(?m)^# (.*?)$", "<h1>$1</h1>");
    }

    private String convertLists(String markdown) {
        StringBuilder html = new StringBuilder();
        Stack<String> listStack = new Stack<>();
        String[] lines = markdown.split("\n");
        boolean inList = false;

        for (String line : lines) {
            if (line.matches("^\\s*- .*$")) {
                if (!inList) {
                    html.append("<ul>\n");
                    inList = true;
                }
                html.append("<li>").append(line.replaceFirst("^\\s*- ", "")).append("</li>\n");
            } else {
                if (inList) {
                    html.append("</ul>\n");
                    inList = false;
                }
                html.append(line).append("\n");
            }
        }
        if (inList) {
            html.append("</ul>\n");
        }
        return html.toString();
    }

    private String convertLinksAndImages(String markdown) {
        markdown = markdown.replaceAll("\\[(.*?)\\]\\((.*?)\\)", "<a href=\"$2\">$1</a>");
        markdown = markdown.replaceAll("!\\[(.*?)\\]\\((.*?)\\)", "<img src=\"$2\" alt=\"$1\" />");
        return markdown;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java MarkdownToHtmlConverter <markdown-text>");
            return;
        }

        MarkdownToHtmlConverter converter = new MarkdownToHtmlConverter();
        String markdown = String.join(" ", args);
        String html = converter.convert(markdown);
        System.out.println(html);
    }
}
