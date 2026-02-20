import java.util.Stack;

public class TextEditor {
    private Document doc;
    private Stack<EditorAction> undoStack;
    private Stack<EditorAction> redoStack;

    public TextEditor(){
        this.doc = new Document();
        this.redoStack = new Stack<>();
        this.undoStack = new Stack<>();
    }
    public void handleInput(String input){}
    public void undo(){}
    public void redo(){}

}
