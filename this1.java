/**
 * @(#)this1.java
 *
 *this digunakan sebagai representasi object saat ini
 * @author 
 * @version 1.00 2019/11/17
 */


public class this1 {
	int angka;
	void test(int x) {
		this.angka=x; // “this” represents the “obj”
		System.out.println( this.angka );
	};
	public static void main(String[ ] args) {
		this1 obj = new this1( );
		obj.test(10);
		}
}