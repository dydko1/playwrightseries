package trash123.stream.exc4.tran;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Transaction {

    private int id;
    private Type type;
    private Long amount;
}