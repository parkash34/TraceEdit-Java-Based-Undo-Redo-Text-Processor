public class InsertAction implements EditorAction {
    private Document doc;
    private int index;
    private String text;

    public InsertAction(Document doc, int index, String text){
        this.doc = doc;
        this.index = index;
        this.text = text;
    }

    public void execute(){}
    public void unexecute(){}
}
