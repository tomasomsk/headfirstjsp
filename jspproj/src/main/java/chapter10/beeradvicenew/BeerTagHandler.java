package chapter10.beeradvicenew;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeerTagHandler extends SimpleTagSupport implements DynamicAttributes {

    private String name;
    private List<String> colorList = new ArrayList<>();

    private Map<String, Object> tagAttrs = new HashMap<>();

    private static final String ATTR_TEMPLATE = "%s='%s' ";
    private static final String OPTION_TEMPLATE = " <option value='%1$s'> %1$s </option>";

    @Override
    public void setDynamicAttribute(String uri, String name, Object value) throws JspException {
        tagAttrs.put(name, value);
    }

    @Override
    public void doTag() throws JspException, IOException {

        PageContext pageContext = (PageContext) getJspContext();
        JspWriter out = pageContext.getOut();

        out.print("<select ");
        out.print(String.format(ATTR_TEMPLATE, "name", name));
        for (String attrName : tagAttrs.keySet()) {
            out.print(String.format(ATTR_TEMPLATE, attrName, tagAttrs.get(attrName)));
        }
        out.print(">");

        for (String aColorList : colorList) {
            out.println(String.format(OPTION_TEMPLATE, aColorList));
        }
        out.print("</select>");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getColorList() {
        return colorList;
    }

    public void setColorList(List colorList) {
        this.colorList = colorList;
    }


}
