package chapter10.customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class CustomTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print("This is the lamest use of a custom tag");
    }
}
