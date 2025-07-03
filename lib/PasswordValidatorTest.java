package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw ="123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 "+pw+": Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 "+pw+": Expected INVALID but got " + result1);
        }
        // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวเล็ก(weak)
        pw = "abcdefghij";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 "+pw+": Letters only is WEAK.");
        } else {
            System.out.println("Test Case 2 "+pw+": Expected WEAK but got " + result2);
        }
        // Test Case 3: ตัวเลขและตัวอักษรตัวพิมพ์เล็กเเละพิมพ์ใหญ่ความยาว6-10ตัวอักษร(medium)
        pw ="abcBCD12345";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 "+pw+": Letters + digits is MEDIUM.");
        } else {
            System.out.println("Test Case 3 "+pw+": Expected MEDIUM but got " + result3);
        }

        // Test Case 4: มีครบทั้งตัวอักษร ตัวเลข พิมพ์เล็กพิมพ์ใหญ่ และอักขระพิเศษความยาว6-10ตัวอักษร(strong)
        pw ="abcBCD123$%";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 "+pw+": Letters + digits + special chars is STRONG.");
        } else {
            System.out.println("Test Case 4 "+pw+": Expected STRONG but got " + result4);
        }

        // --- เขียน Test Case อื่นๆ ต่อ ---

        System.out.println("--------------------------------");
    }
}
