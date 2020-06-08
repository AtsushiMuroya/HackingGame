import java.util.Random;

class Question {

  int count;
  Random random;
  Word word = new Word();
  QuestionSentence qs = new QuestionSentence();

  //常に表示されている１・２文目の文章の表示
  public void display(int count){
    System.out.println("WELLECOM TO HACKINGGAME [TERMLINK]");
    System.out.println("パスワードが必要です。");
    //可能回数の表示
    this.count = count;
    for(int i = 0;i<count;i++){
      System.out.print(" ■ ");
    }
    System.out.println();
    System.out.println("試行回数は "+count+" 回です。");

  }

  //問題文の表示
  public void makeQuestion(){
    for(int i = 0;i<10;i++){
      for(int j =0;j<2;j++){
        System.out.print(qs.makeSentence());
      }
      System.out.println();

    }
  }

}
