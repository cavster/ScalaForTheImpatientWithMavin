/**
 * Created by colmcavanagh on 5/6/14.
 */
def values(fun: (Int) => Int, low: Int, high: Int) = (low to high).map(i => (i, fun(i)))
values(x=> x * x ,-8 , 5)
//fun is the funotion which we apply to the