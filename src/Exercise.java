import java.util.Scanner;


public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner input = new Scanner(System.in);
				System.out.print("Nhap so nguyen n: ");

				int value = input.nextInt();

				//SoNguyenTo(value);
				//SoHoanThien(value);
				//SoChinhPhuong(value);
				//SoLapPhuong(value);
				//SoDoiXung(value);
				//TongNSo(value);
				//TongNSoThapPhan(value);
				//fibonacci(value);
				TamGiacPascal(value);
				input.close();

	}
	/**
	 * Bai 1: Cho số nguyên dương n, cho biết số n có phải  là số nguyên tố không?
	 * @param n
	 */
	static void SoNguyenTo(int n)
	{
		if(n <= 1)
		{
			System.out.println("So " + n + " khong phai la so nguyen to");
		}else
		{
			Boolean nt = true;
			for(int i = 2; i<n;i++)
			{
				if(n%i == 0){
					nt = false;
					break;

				}
			}

			if(nt == true)
				System.out.println("So " + n + " la so nguyen to");
			else
				System.out.println("So " + n + " khong phai la so nguyen to");
		}
	}
	/**
	 * Bai 2: Cho số nguyên dương n, cho biết số n có phải là số hoàn thiện không?
	 * VD: 6, 28(là tổng các ước số của nó bằng chính nó) 1 2 4 7 14
	 * @param n
	 */
	static void SoHoanThien(int n)
	{
		if(n <=1)
			System.out.println("So "+ n + " khong phai la so hoan thien");
		else{
			int sum = 0;
			for(int i = 1; i<= n/2; i++)
			{
				if(n % i == 0)
				{
					sum = sum+i;
				}
			}
			if(sum == n)
				System.out.println("So "+ n + " la so hoan thien");
			else 
				System.out.println("So "+ n + " khong phai la so hoan thien");
		}
	}
	
	/**
	 * Bài 3: cho số nguyên dương n, cho biết số n có phải là số  chính phương không?VD: 4,9,16(rút căn bậc 2  )
	 * @param n
	 */
	static void SoChinhPhuong(int n)
	{
		if(n <= 1)
		{
			System.out.println("So " + n + " khong phai la so chinh phuong");
		}else{
			Boolean _chinhphuong = false;
			for(int i = 1; i <(int)(n/2 + 1); i++)
			{
				if(i * i == n)
				{
					_chinhphuong = true;
					break;
				}
			}
			
			if(_chinhphuong)
				System.out.println("So " + n + " la so chinh phuong");
			else
				System.out.println("So " + n + " khong phai la so chinh phuong");
		}

	}
	/**
	 * Bài 4: Cho số nguyên dươn n, cho biết số n có phải là số lập  phương không?(3^3) = 9
	 * @param n
	 */
	static void SoLapPhuong(int n)
	{
		if(n <= 1)
		{
			System.out.println("So " + n + " khong phai la so lap phuong");
		}else{
			Boolean _lapphuong = false;
			for(int i = 1; i <(int)(n/2 + 1); i++)
			{
				if(i * i * i == n)
				{
					_lapphuong = true;
					break;
				}
			}
			
			if(_lapphuong)
				System.out.println("So " + n + " la so lap phuong");
			else
				System.out.println("So " + n + " khong phai la so lap phuong");
		}
	}
	/**
	 * Bài 5: Kiểm tra số đối xứng: VD: 12321, 1001
	 * @param n
	 */
	static void SoDoiXung(int n)
	{
		if(n <= 0)
		{
			System.out.println("So " + n + " khong phai la so doi xung.");
		}else{
			int sogoc, sodao, donvi;
			
			sogoc = n;
			sodao = 0;
			
			while(sogoc > 0){
				donvi = sogoc%10;
				sodao = sodao*10 + donvi;
				sogoc = sogoc/10;
			}
			
			if(sodao == n)
				System.out.println("So " + n + " la so doi xung.");
			else
				System.out.println("So " + n + " khong phai la so doi xung.");
		}
	}
	/**
	 * Bài 6: Nhập số nguyên dương n, hãy tính tổng n - VD: n = 5 = 1 + 2 + 3 + 4 + 5
	 * @param n
	 */
	static void TongNSo(int n)
	{
		if(n >= 0){
			int tong = 0;
			for(int i = 1; i <= n; i ++)
			{
				tong += i;
			}
			System.out.println("Tong cua " + n + " la: " + tong);
		}
	}
	/**
	 * Bài 7: Nhập số nguyên n, hãy tính tổng : ½ + ⅔ + ¾ + … n-1/n
	 * @param n
	 */
	static void TongNSoThapPhan(int n)
	{
		if(n >= 0){
			float tong = 0;
			for(float i = 1; i <= n; i++)
			{
				tong += (i - 1)/i;
			}
			System.out.println("Tong cua " + n + " la: " + tong);
		}
	}
	
	/**
	 * Bài 9: Nhập số nguyên n, xuất dãy số fibonacy: VD:  n= 8,  1 1 2 3 5 8 13 21
	 * @param n
	 */
	static void fibonacci(int n)
	{
		if(n == 0 || n == 1)
		{
			System.out.println("Day fibonacci la: 1");
		}else{
			int s1 = 0, s2 = 1,s;
			System.out.print("1 ");
			for(int i = 1; i <= n ; i++)
			{
				s = s1 + s2;
				System.out.print(s + " ");
				s1 = s2;
				s2 = s;
			}
		}
	}
	
	/**
	 * Bài 10: xuất tam giác pascal:
	 * @param n
	 */
	static void TamGiacPascal(int n)
	{
		for(int i = 0; i <=n; i++)
		{
			for(int j = 1; j<= i +1; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
/*

Bài 8: Nhập số nguy

 */

