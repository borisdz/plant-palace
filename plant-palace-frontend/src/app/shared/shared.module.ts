import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { ButtonComponent } from './components/button/button.component';
import { TextboxComponent } from './components/textbox/textbox.component';
import { TextareaComponent } from './components/textarea/textarea.component';
import { ImageUploadComponent } from './components/image-upload/image-upload.component';
import { NavigationDropdownComponent } from './components/navigation-dropdown/navigation-dropdown.component';



@NgModule({
  declarations: [
    HeaderComponent,
    FooterComponent,
    ButtonComponent,
    TextboxComponent,
    TextareaComponent,
    ImageUploadComponent,
    NavigationDropdownComponent,
  ],
  imports: [
    CommonModule,
  ],
  exports: [
    HeaderComponent,
    FooterComponent,
    ButtonComponent,
    TextboxComponent,
    TextareaComponent,
    ImageUploadComponent,
    NavigationDropdownComponent,
  ]
})
export class SharedModule { }
