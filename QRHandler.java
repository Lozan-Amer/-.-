public class QRHandler {

    private String userId;
    private String appDownloadUrl;

    public QRHandler(String userId) {
        this.userId = userId;
        this.appDownloadUrl = "https://citypulse-app.com/download"; // כתובת קבועה
    }

    // שירות להצגת טקסט שמזהה את המשתמש
    public String getUserQRText() {
        return "User ID: " + userId;
    }

    // שירות להצגת קישור להורדת האפליקציה
    public String getAppDownloadQRText() {
        return "Scan to download: " + appDownloadUrl;
    }

    // שירות שמשלב את שניהם (כמו במסך שסיפקת)
    public String generateCombinedQRContent() {
        return getUserQRText() + "\n" + getAppDownloadQRText();
    }
}
