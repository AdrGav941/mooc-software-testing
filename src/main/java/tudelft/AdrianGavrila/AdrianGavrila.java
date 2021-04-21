package tudelft.AdrianGavrila;

public class AdrianGavrila {
    String firstName = "Adrian";
    String lastName = "Gavrila";
    String UCINetID = "agavrila";
    int studentNumber = 90392179;

    public String getFullName() {
        return (firstName + " " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUCINetID() {
        return UCINetID;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    String getRotatedFullName(int shift) {
        String unShiftedName = firstName + " " + lastName;
        if (shift == 0) {
            return unShiftedName;
        }
        if (shift > 0) {
            return leftRotate(unShiftedName, shift);
        }
        else {
            return rightRotate(unShiftedName, shift * -1);
        }
    }

    public String leftRotate(String str, int d)
    {
        String retStr = str.substring(d) + str.substring(0, d);
        return retStr;
    }

    // function that rotates s towards right by d
    public String rightRotate(String str, int d)
    {
        return leftRotate(str, str.length() - d);
    }
}
