##注解说明
-@Autowried:自动装配通过类型。名字
    如果Autowried不能唯一自动装配上属性，则需要通过@Qualifier(value="")
-@Nullable:字段标记了这个注解，说明这个字段可以为null
-@Resource:自动装配通过名字。类型
-@Component:组件，放在类上，说明这个类被spring管理了，就是bean
 有几个衍生注解，我们在web开发中，会按照mvc三层架构分层!
 -@Repository
 -@Service
 -@Controller
 这四个注解功能都是一样的，都是代表将某个类注册到spring中，装配Bean
-@Configuration:将想要的组件添加到容器中








