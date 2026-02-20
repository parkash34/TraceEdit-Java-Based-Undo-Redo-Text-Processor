public class DeleteAction implements EditorAction {
    private Document doc;
    private int index;
    private String savedText;

    public DeleteAction(Document doc, int index, String savedText){
        this.doc = doc;
        this.index = index;
        this.savedText = savedText;
    }

    public void execute(){}
    public void unexecute(){}
}
