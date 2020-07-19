import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationFormComponent } from './component/registration-form/registration-form.component';
import { LoginComponent } from './component/login/login.component';
import { LogoutComponent } from './component/logout/logout.component';
import {HttpDataService} from './service/http-data.service';
import {CustomvalidationService} from './service/customvalidation.service';
import {HttpClientModule} from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MenuBarComponent } from './component/menu-bar/menu-bar.component';
import { ValidateUserNameDirective } from './directives/validate-user-name.directive';
import { MatchPasswordDirective } from './directives/match-password.directive';
import { PasswordPatternDirective } from './directives/password-pattern.directive';


@NgModule({
  declarations: [
    AppComponent,
    RegistrationFormComponent,
    LoginComponent,
    LogoutComponent,
    MenuBarComponent,
    ValidateUserNameDirective,
    MatchPasswordDirective,
    PasswordPatternDirective,
  
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule
  ],
  providers: [HttpDataService,CustomvalidationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
