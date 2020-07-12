import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {RouterGuardService} from './service/router-guard.service';
import { RegistrationFormComponent } from './component/registration-form/registration-form.component';
import { LoginComponent } from './component/login/login.component';



const routes: Routes = [
  {path: '', component: LoginComponent },
  {path: 'login', component: LoginComponent },
  { path:'register' , component: RegistrationFormComponent , canActivate:[RouterGuardService] },
  {path: '**', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]  
})
export class AppRoutingModule { }
