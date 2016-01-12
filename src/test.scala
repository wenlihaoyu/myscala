
//计算数的阶乘
object factoral{
  def main(args: Array[String]) {
  def factoral(x:Int):Int = {
    if(x<=0)
      1
    else
      x*factoral(x-1)
  }
  println("10!="+factoral(10))}

}

object mylist {
  //
  val lst = (List.range(1, 100)).toList

  //filter
  val Lfilter = lst.filter(_>90) // or lst.filter(x=>x>90)

 // def sum copy
  //def sum(a: Int, b: Int, c: Int) = a + b + c
  val Sum = sum _
// except
def f(x:Int): Int ={
    if (x == 0)
      throw new Exception("boom!")
    else
      x+f(x-1)}

  //iseven
def iseven(x:Int):Boolean={
  if(x==0)
    true
  else
    iseven(x-1)
  }
}

// def function ()()

def ff(x:Int)(y:Int)(z:Int)=x+y+z

def first(x: Int) = (y: Int) =>(z:Int)=> x + y+z


def twice(op: Double => Double, x: Double) = op(op(x))
twice(x=>x+1,10)  // twice(_+1,10)



val lst  = (List.range(1,101)).toList
//map
lst.map(x=>x+1) // equals : lst.map(_+1) or lst map (_+1)

// reduce

lst.reduce(_+_) // lst.reduce((x,y)=>x+y) or lst reduce (_+_)

// fold
lst.fold(0)((x,y)=>x+y) // lst.fold(0)(_+_)

//filter

lst.filter(_>50) // lst.filter(x=>x>50) or lst filter (_>50)

//partition

lst.partition(_>50) // lst.partition(x=>x>50)  or lst partition (_>50)

// find The find method is also similar to filter but it returns the first element satisfying a given predicate
lst.find(_>50) // lst.find(x=>x>50) lst find (_>50)

//takeWhile The takeWhile and dropWhile operators also take a predicate as their right operand
lst.takeWhile(_<50)
lst.dropWhile(_<50)
//span

lst.span(_>50)

// Folding lists: /: and :\
// sum the lst
(0/:lst)(_+_)
(lst \:0)(_+_)

// fill

List.fill(5)('4')
// The tabulate method creates a list whose elements are computed according to a supplied function
List.tabulate(5,5)(_+_)

// concat
List.concat(lst,lst) // lst:::lst

// Processing multiple lists together
list.zip(lst) // (lst,lst).zipped.map(_+_)
// 判断所有元素是否满足同一条件
lst.forall(_>0)
// 判断元素是否存在
lst.exists(_>0)

// 排序
lst.sortWith(_>_)


}