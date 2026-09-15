import javax.swing.*;

public class Confirmationbox
{
    public static void main(String[] args)
    {
        JOptionPane.showConfirmDialog(
            null,
            "Done you want to exit",
            "EXIT",
            JOptionPane.YES_NO_CANCEL_OPTION);
    }
}
