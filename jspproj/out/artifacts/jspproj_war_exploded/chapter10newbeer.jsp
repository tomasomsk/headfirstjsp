<%@ taglib prefix="formTags" uri="CustomTags" %>
<form method="POST" action="SelectBeer.do">
    <p>Select beer characteristics:</p>
    Color:
    <formTags:select name="color" size="1" colorList="${applicationScope.colorList}"/>
    <br><br>
    <input type="SUBMIT">
</form>