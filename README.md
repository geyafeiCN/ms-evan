# 学习项目

# 项目结构

```
├─ ms-evan-doc-文档管
├─ ms-basics-基础服务
│  ├─ 服务注册中心
│  │- ms-center:9000...9099 
│  ├─ 统一配置中心
│  │- ms-config:9100...9199 
│  ├─ 网关路由中心
│  │- ms-gate:80 
│  ├─ 分布式日志收集中心
│  │- ms-elk:
│  ├─ 分布式任务调度中心
│  │- ms-xxljop:
------------------------------------------
├─ ms-core-核心服务
│  ├─ 通用组件
│  │- ms-code-common
│  ├─ 数据库
│  │- ms-code-db
│  ├─ 缓存
│  │- ms-code-cac
│  ├─ 日志处理
│  │- ms-code-log
│  ├─ 代码工厂
│  │- ms-code-codefactory
------------------------------------------
├─ ms-pay-支付服务
│  │
│  ├─ 支付服务接口
│  │- ms-online-api
│  ├─ 阿里支付
│  │- ms-pay-alipay
│  ├─ 微信支付
│  │- ms-pay-wechat
│  ├─ 银联支付
│  │- ms-pay-union
------------------------------------------
├─ ms-weixin-微信服务
│  │port:10300...10399
│  ├─ 微信服务接口层
│  │- ms-weixin-interfaces
│  ├─ 微信服务应用层
│  │- ms-weixin-application
│  ├─ 微信服务领域层
│  │- ms-weixin-domain
│  ├─ 微信服务基础设施层
│  │- ms-weixin-infrastructure
├─ ms-member-会员服务
│  │port:10400...10499
│  ├─ 会员服务接口层
│  │- ms-member-interfaces
│  ├─ 会员服务应用层
│  │- ms-member-application
│  ├─ 会员服务领域层
│  │- ms-member-domain
│  ├─ 会员服务基础设施层
│  │- ms-member-infrastructure
------------------------------------------
├─ ms-ms-commodity-商品服务
│  │port:10500...10599
│  ├─ 商品服务接口层
│  │- ms-commodity-interfaces
│  ├─ 商品服务应用层
│  │- ms-commodity-application
│  ├─ 商品服务领域层
│  │- ms-commodity-domain
│  ├─ 商品服务基础设施层
│  │- ms-commodity-infrastructure
------------------------------------------
├─ ms-order-订单服务
│  │port:10600...10699
│  ├─ 订单服务接口层
│  │- ms-order-interfaces
│  ├─ 订单服务应用层
│  │- ms-order-application
│  ├─ 订单服务领域层
│  │- ms-order-domain
│  ├─ 订单服务基础设施层
│  │- ms-order-infrastructure
------------------------------------------
├─ ms-search-搜索服务
│  │
│  ├─ms------------
│  │
│  ├─ms------------
------------------------------------------
├─ ms-sso-单点登录服务
│  │
│  ├─ms------------
│  │
│  ├─ms------------
------------------------------------------
├─ ms-shopping-购物车服务
│  │
│  ├─ms------------
│  │
│  ├─ms------------
------------------------------------------
├─ ms-message-消息服务
│  │
│  ├─ms------------
│  │
│  ├─ms------------
------------------------------------------
├─ ms-notice-通知服务
│  │
│  ├─ms------------
│  │
│  ├─ms------------
------------------------------------------

```