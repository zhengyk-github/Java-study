# Java-study
github提交代码提交不上进行如下操作

**git 设置代理：**

git config --global --unset http.proxy

git config --global --unset https.proxy

**解除SSL认证：**

git config --global http.sslVerify "false"

**更新DNS缓存:**

ipconfig  /flushdns



**文件过大，超过上限**

修改为 500MB，在 `Git Bash` 中输入以下命令：

git config http.postBuffer 5242880003
