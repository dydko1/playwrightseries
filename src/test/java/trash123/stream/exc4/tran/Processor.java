package trash123.stream.exc4.tran;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Processor {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(1, Type.DEBIT, 100L);

        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction(1, Type.DEBIT, 100L));
        transactionList.add(new Transaction(2, Type.CREDIT, 150L));
        transactionList.add(new Transaction(3, Type.CREDIT, 200L));
        transactionList.add(new Transaction(4, Type.DEBIT, 250L));

        Stream<Long> map = transactionList.stream()
                .map((t) ->
                {
                    t.setAmount(t.getAmount() * 2);
                    return t.getAmount();
                });

//        List<Transaction> transactionList2 = transactionList.stream()
//                .filter(t -> t.getType().equals(Type.DEBIT))
//                .collect(Collectors.toList());
//        System.out.println(transactionList2);
    }
}