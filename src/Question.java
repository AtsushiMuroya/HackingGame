class Question {

  int count;

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

  public void oneSentence(){

  }
}
