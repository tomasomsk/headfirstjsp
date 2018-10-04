<form method=”POST” action=”SelectBeer.do” xmlns:formTags="http://www.w3.org/1999/xhtml">
    <p>Select beer characteristics:</p>
    Color:
    <formTags:select name=’color’ size=’1’
                     optionsList=’${applicationScope.colorList}’ />
    <br><br>
    <input type=”SUBMIT”>
</form>