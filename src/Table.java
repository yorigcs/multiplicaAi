public class Table {
    int number;
    int[] tableNumbers = new int[10];

    public Table(int number) {

        this.number = number;
        this.arrayMultiplication();
    }

    private void arrayMultiplication() {
        for (int i = 0; i < tableNumbers.length; i++) {
            tableNumbers[i] = (i +1) * number;
        }
    }

    public void printTable() {
        String title = String.format("Tabela de multiplicação de %d",number);
        System.out.println(title);
        for (int i = 0; i < tableNumbers.length; i++) {
            String multiplication = String.format("%dx%d = %d",number,i + 1, tableNumbers[i]);
            System.out.println(multiplication);
        }
    }


}
