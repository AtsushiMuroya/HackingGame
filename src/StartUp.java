class StartUp{
  public static void main(String[] args) {

    int gameCount;
    Title title = new Title();
    Level level = new Level();
    Question question = new Question();
    QuestionSentence qs = new QuestionSentence();


    //タイトル画面表示
    title.display();

    //レベル選択画面
    level.display();

    //ゲームスタート
    gameCount = level.gameCount();
    question.display(gameCount);
    question.makeQuestion();
  }
}
