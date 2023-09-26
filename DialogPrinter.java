public class DialogPrinter {

    public static void printDialog(String dialog) {
        if (dialog != null) {
            int index = 0;
            while (index < dialog.length()) {
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    // Handle the interrupted exception, if needed.
                }
                System.out.print(dialog.charAt(index));
                index = index + 1;
            }
        }
    }
}
