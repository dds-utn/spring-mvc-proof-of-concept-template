package dds.signup;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;

import dds.config.WebAppConfigurationAware;

public class SignupControllerTest extends WebAppConfigurationAware {
  @Test
  public void displaysSignupForm() throws Exception {
    mockMvc
    .perform(get("/signup"))
    .andExpect(model().attributeExists("signupForm"))
    .andExpect(view().name("signup/signup"))
    .andExpect(
        content().string(
            allOf(containsString("<title>Signup</title>"),
                containsString("<legend>Please Sign Up</legend>"))));
  }
}