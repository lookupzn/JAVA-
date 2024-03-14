package com.ning.thread_;

import java.util.concurrent.*;

// 自定义Callable
class Callable_ implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // 模拟计算需要一秒
        Thread.sleep(1000);
        return 2;
    }
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        // 使用
        ExecutorService executor = Executors.newCachedThreadPool();
        Callable_ call = new Callable_();
        Future<Integer> result = executor.submit(call);
        // 注意调用get方法会阻塞当前线程，直到得到结果。
        // 所以实际编码中建议使用可以设置超时时间的重载get方法。
        System.out.println(result.get());
    }
}
