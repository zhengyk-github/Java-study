package com.Netty.BIO;

import lombok.experimental.var;

import javax.lang.model.element.VariableElement;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: BIOServer
 * @Date: Created in 2025/2/26 10:39
 * @Version: 1.0
 * @Author: zhengyongkai
 * @Modified By:
 * @Description: cmd->telnet 127.0.0.1 6666 -> ctrl+] -> send hello
 **/
public class BIOServer {
	public static void main(String[] args) throws IOException {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		ServerSocket serverSocket = new ServerSocket(6666);
		System.out.println("服务器启动了！");
		while (true) {
			System.out.println("线程名称：" + Thread.currentThread().getId() + "，线程名称：" + Thread.currentThread().getName());
			//监听客户端连接
			System.out.println("等待socket连接...");
			final Socket socket = serverSocket.accept();
			System.out.println("连接到一个客户端");
			newCachedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					//可以和客户端通信
					handler(socket);
				}
			});
		}

	}

	public static void handler(Socket socket) {
		try {
			byte[] bytes = new byte[1024];
			//通过socket获取输入流
			InputStream inputStream = socket.getInputStream();
			while (true) {
				System.out.println("线程名称=" + Thread.currentThread().getId() + "，线程名称=" + Thread.currentThread().getName());
				System.out.println("等待read...");
				int read = inputStream.read(bytes);
				if (read != -1) {
					//输出客户端发送的信息
					System.out.println(new String(bytes, 0, read));
				} else {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
