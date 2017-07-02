package anubi.common.test.scala

  import anubi.common.main.scala.FileManager
  import org.scalatest.FunSuite

/**
  * Created by Roberto on 02/07/2017.
  */
  class FileManagerTest extends FunSuite {

    test("""fake test""") {

      val stack = new FileManager
      val result = stack.save("")

      assert(result === true)
    }

}
