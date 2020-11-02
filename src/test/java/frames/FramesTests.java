package frames;

import base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends baseTests {
    @Test
    public void testWysiwyg(){
        var editorPage= homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1= "Hello ";
        String text2= "World!";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text is incorrect");
    }
}
