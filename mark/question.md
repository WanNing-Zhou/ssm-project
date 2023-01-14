# 项目中遇到的问题

## npm i vue-router 错误

vue项目在安装路由时不管是npm vue-router还是npm install vue-router --save或者是npm install vue-router@next --save都会报如下错误

    npm ERR! code ERESOLVE
    npm ERR! ERESOLVE unable to resolve dependency tree
    npm ERR!
    npm ERR! While resolving: ydl-ui@0.1.0
    npm ERR! Found: vue@2.7.14
    npm ERR! node_modules/vue
    npm ERR!   vue@"^2.6.14" from the root project
    npm ERR!
    npm ERR! Could not resolve dependency:
    npm ERR! peer vue@"^3.2.0" from vue-router@4.1.6
    npm ERR! node_modules/vue-router
    npm ERR!   vue-router@"*" from the root project

**解决办法** 

在package.json文件的dependencies中添加"vue-router
然后再输入npm install vue-router@next --save进行安装就可以安装成功了。



