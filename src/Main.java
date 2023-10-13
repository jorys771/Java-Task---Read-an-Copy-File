import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Mulai timer
        long start = System.currentTimeMillis();


        FileReader isiCurrentFile = new FileReader("D:/- John Ryan SIallagan/_JOB/PT Infosys Solusi Terpadu/_TRAINING/Code/Task - Read and Copy File/src/file.txt");
        BufferedReader isiCurrentFileBox = new BufferedReader(isiCurrentFile);

        File nextFile = new File("D:/- John Ryan SIallagan/_JOB/PT Infosys Solusi Terpadu/_TRAINING/Code/Task - Read and Copy File/src/file_baru.txt");
        FileWriter isiNextFile = new FileWriter(nextFile);

        String line;
        while ((line = isiCurrentFileBox.readLine()) != null) {
            String newLine = line.replace("|", "\n");

            isiNextFile.write(newLine);
        }

        isiCurrentFile.close();
        isiNextFile.close();


        // Berhenti timer
        long end = System.currentTimeMillis();

        // Cek waktu eksekusi
        System.out.println("Waktu Eksekusi: " + (end - start) + " milliseconds");
    }
}