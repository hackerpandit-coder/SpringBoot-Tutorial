import { Component, OnInit } from '@angular/core';
import { AuthGuardService } from 'src/app/service/auth-guard.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers : [AuthGuardService]
})
export class LoginComponent implements OnInit {

  constructor(private service: AuthGuardService) { }

  ngOnInit(): void {

  }

}
