package Pegas.seminar7.example7_2;

//@Service
//public class AuthenticationProviderService implements AuthenticationProvider {
//
//    @Autowired
//    private JpaUserDetailsService userDetailsService;
//
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Autowired
//    private SCryptPasswordEncoder sCryptPasswordEncoder;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String username = authentication.getName();
//        String password = authentication.getCredentials().toString();
//
//        CustomUserDetails user = userDetailsService.loadUserByUsername(username);
//
//        switch (user.getUser().getAlgorithm()) {
//            case BCRYPT:
//                return checkPassword(user, password, bCryptPasswordEncoder);
//            case SCRYPT:
//                return checkPassword(user, password, sCryptPasswordEncoder);
//        }
//
//        throw new  BadCredentialsException("Bad credentials");
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(aClass);
//    }
//
//    private Authentication checkPassword(CustomUserDetails user, String rawPassword, PasswordEncoder encoder) {
//        if (encoder.matches(rawPassword, user.getPassword())) {
//            return new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(), user.getAuthorities());
//        } else {
//            throw new BadCredentialsException("Bad credentials");
//        }
//    }
//}
