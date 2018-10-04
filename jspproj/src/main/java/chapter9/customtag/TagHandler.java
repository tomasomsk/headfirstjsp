package chapter9.customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class TagHandler extends SimpleTagSupport {

    private String userName;

    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("Hello " + userName + " <br>");
        getJspContext().getOut().write("Your advice is: " + getAdvice());
    }

    private String getAdvice() {
        String[] adviceStrings = {"That color’s not working for you.",
                "You should call in sick.", "You might want to rethink that haircut."};
        int random = (int) (Math.random() * adviceStrings.length);
        return adviceStrings[random];
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
