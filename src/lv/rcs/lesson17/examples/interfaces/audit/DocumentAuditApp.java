package lv.rcs.lesson17.examples.interfaces.audit;

public class DocumentAuditApp {

    public static void main(String[] args) {
        LawDocument lawDocument = new LawDocument();
        Report report = new Report();

        logChanges(lawDocument);
        logChanges(report);
    }

    static void logChanges(Document document) {
        //saving changes in database
        String changes = document.getChanges();
        //save
    }
}
