package task;


import lombok.*;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
@Builder
@Data //create instance easily from a class, and generate all AllArgsContructor unless there is another @XConstactor
public class Orange {

    private int weight;
    private Color color;

}
