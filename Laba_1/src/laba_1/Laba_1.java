
package laba_1;
import java.util.Scanner;

public class Laba_1 {
static String parol = "89834081774";                              //Вводим исходный пароль для подтверждения
static String parol_1;                                      // пустое знаение для ввода пароля для проверки
static String Vvod_parol() {                                  // Метод для ввода пароля для последующей проверки
Scanner conin = new Scanner(System.in);
System.out.println("Введите пароль для входа : ");            // 
parol_1 = conin.nextLine();
System.out.println("Введенный пароль: " + parol_1);
return parol_1;
}
static void Proverka() {                            // Метод для проверки введенного пароля
if (parol.equals(parol_1))                                 // Если пароли совпадают то выводится сообщение
System.out.println("Ваш пароль введен верно");
else                                                       // Если пароли не совпадают выводится следующее сообщение
System.out.println("В вашем пароле есть ошибки, попробуйте в следующий раз");
}
public static void main(String[] args) {
Vvod_parol();
Proverka();
}   
}
