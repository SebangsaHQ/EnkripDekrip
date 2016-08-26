package org.tego.workshop.android.ende;

/**
 * Kelas yang digunakan untuk melakukan enkripsi dan dekripsi
 * 
 * @author AAR
 *
 */
public class EnkripsiDeskripsi {

	/**
	 * Method yang digunakan untuk mengenkripsikan sebuah teks
	 * 
	 * @param str
	 *            sebuah string yang dimasukkan untuk pengenkripsian
	 * @param kunci
	 *            nilai kunci untuk pengenkripsian
	 * @return nilai pengembalian yang berupa string encrypted
	 */
	public static String enkripsiKan(String str, int kunci) {
		// Variabel yang digunakan untuk menyimpan karakter
		String enkripsi = "";

		// Lakukan perulangan sesuai dengan panjang str
		for (int i = 0; i < str.length(); i++) {
			// Ambil setiap karakter dari str simpan dalam variabel c
			int c = str.charAt(i);

			// Cek apakah karakter huruf kapital dalam variabel c
			if (Character.isUpperCase(c)) {
				// Modulus kunci dengan 26 dimana 26 merupakan jumlah abjad yang
				// ada, jumlahkan hasilnya dengan c dan simpan dalam variabel c
				c = c + (kunci % 26);

				// Jika c lebih besar dari pada Z (uppercase) maka
				if (c > 'Z') {
					// Kurangi c dengan 26 dan simpan dalam variabel c
					c = c - 26;
				}
				// Cek apakah karakter huruf non kapital dalam variabel c
			} else if (Character.isLowerCase(c)) {
				// Modulus kunci dengan 26 dimana 26 merupakan jumlah abjad yang
				// ada, jumlahkan hasilnya dengan c dan simpan dalam variabel c
				c = c + (kunci % 26);

				// Jika c lebih besar dari pada z (lowercase) maka
				if (c > 'z') {
					// Kurangi c dengan 26 dan simpan dalam variabel c
					c = c - 26;
				}
			}

			// Tambahkan karakter c ke dalam variabel enkripsi
			enkripsi += (char) c;
		}

		// Nilai pengembalian
		return enkripsi;
	}

	/**
	 * Method yang digunakan untuk mendekripsikan sebuah teks
	 * 
	 * @param str
	 *            sebuah string yang dimasukkan untuk pendekripsian
	 * @param kunci
	 *            nilai kunci untuk pendekripsian
	 * @return nilai pengembalian yang berupa strin dekripsi
	 */
	public static String dekripsiKan(String str, int kunci) {
		// Variabel yang digunakan untuk menyimpan pendekripsian
		String dekripsi = "";

		// Cek panjang karakter dari str. Lakukan perulangan sesuai dengan
		// jumlah panjang dari karakter str
		for (int i = 0; i < str.length(); i++) {
			// Ambil setiap karakter dari str simpan dalam variabel c
			int c = str.charAt(i);

			// Cek apakah karakter berhuruf kapital
			if (Character.isUpperCase(c)) {
				// Modulus kunci dengan 26 dimana 26 merupakan jumlah alpabet.
				// Kurangi c dengan hasil dari modulus kunci dengan 26
				c = c - (kunci % 26);

				// Cek apakah c kurang dari A (uppercase)
				if (c < 'A') {
					// Tambah variabel c dengan 26 dan simpan dalam variabel c
					c = c + 26;
				}
				// Cek apakah karakter berhuruf non kapital
			} else if (Character.isLowerCase(c)) {
				// Modulus kunci dengan 26 dimana 26 merupakan jumlah alpabet.
				// Kurangi c dengan hasil dari modulus kunci dengan 26
				c = c - (kunci % 26);

				// Cek apakah c kurang dari a (lowercase)
				if (c < 'a') {
					// Tambah variabel c dengan 26 dan simpan dalam variabel c
					c = c + 26;
				}
			}

			// Tambahkan variabel c dalam variabel dekripsi
			dekripsi += (char) c;
		}

		// Nilai dari pengembalian
		return dekripsi;
	}

}
