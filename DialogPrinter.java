public class DialogPrinter {

    public static void printDialog(String dialog) {
        if (dialog != null) {
            int index = 0;
            
            while (index < dialog.length()) {
                try {
                    if ('.' == dialog.charAt(index)){
                        Thread.sleep(300);}
                    else {
                        Thread.sleep(20);}    
                } catch (InterruptedException e) {
                    // Handle the interrupted exception, if needed.
                }
                System.out.print(dialog.charAt(index));
                index = index + 1;
            }
        }
    }
}
