import java.util.Random;
import java.util.HashMap;

class QuestionSentence{

  String sentence;
  //HashMap<int,String> hp = new HashMap<>();
  Word word = new Word();
  Random random = new Random();


  public String makeSentence(){
    int r_Sentence = random.nextInt(10);
    int r_Word = random.nextInt(7);
    switch(r_Sentence){
      case 0:
      sentence = "0xF2c0:"+ word.foreWord[r_Word] +"=[>@@  ";
      return sentence;
      case 1:
      sentence = "0xF5c2:"+"*==~@"+word.foreWord[r_Word]+"  ";
      return sentence;
      case 2:
      sentence = "0xF6c6:"+ word.foreWord[r_Word] +"??$#=  ";
      return sentence;
      case 3:
      sentence = "0xF4c1:"+"&!&%!"+word.foreWord[r_Word]+"  ";
      return sentence;
      case 4:
      sentence = "0xF9c3:"+ word.foreWord[r_Word] +"@)()*  ";
      return sentence;
      case 5:
      sentence = "0xF1c0:"+"**&%$"+word.foreWord[r_Word]+"  ";
      return sentence;
      case 6:
      sentence = "0xF0c0:"+ word.foreWord[r_Word] +"&%&<<  ";
      return sentence;
      case 7:
      sentence = "0xF3c8:"+ word.foreWord[r_Word] +"__*+>  ";
      return sentence;
      case 8:
      sentence = "0xF9c9:"+ word.foreWord[r_Word] +"_->>@  ";
      return sentence;
      case 9:
      sentence = "0xF8c1:"+ word.foreWord[r_Word] +"<>+++  ";
      return sentence;
      default:
      sentence = Integer.toString(r_Sentence);
      return sentence;
    }

  }




}
