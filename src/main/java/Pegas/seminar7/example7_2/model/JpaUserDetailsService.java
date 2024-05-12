package Pegas.seminar7.example7_2.model;

//@Service
//public class JpaUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public CustomUserDetails loadUserByUsername(String username) {
//        Supplier<UsernameNotFoundException> s =
//                () -> new UsernameNotFoundException("Problem during authentication!");
//
//        User u = userRepository.findUserByUsername(username).orElseThrow(s);
//
//        return new CustomUserDetails(u);
//    }
//}
