/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package image;


public class pt2 {
    public static double[] giai2(double a, double b, double c) {
    double[] ketQua = new double[3];  // Mảng để chứa các giá trị nghiệm (tối đa 2 nghiệm)
    
    if (a == 0) {
        if (b == 0) {
            // Nếu a = 0 và b = 0
            ketQua[0] = Double.NaN; // Không có nghiệm
            ketQua[1] = Double.NaN;
            ketQua[2] = Double.NaN; // Chỉ cần 1 giá trị duy nhất, nếu muốn, có thể báo là vô nghiệm
        } else {
            // Nghiệm duy nhất khi a = 0
            ketQua[0] = -c / b;
        }
        return ketQua;
    }
    
    // Phương trình bậc 2: ax^2 + bx + c = 0
    double delta = b * b - 4 * a * c;
    
    if (delta > 0) {
        // Hai nghiệm phân biệt
        ketQua[0] = (-b + Math.sqrt(delta)) / (2 * a);
        ketQua[1] = (-b - Math.sqrt(delta)) / (2 * a);
    } else if (delta == 0) {
        // Nghiệm kép
        ketQua[0] = -b / (2 * a);
    } else {
        // Không có nghiệm (delta < 0)
        ketQua[0] = Double.NaN; // Đánh dấu vô nghiệm
        ketQua[1] = Double.NaN;
    }
    
    return ketQua;
}

}
