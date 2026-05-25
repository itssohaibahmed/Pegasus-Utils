# Pegasus-Utils

[![JitPack](https://jitpack.io/v/itssohaibahmed/Pegasus-Utils.svg)](https://jitpack.io/#itssohaibahmed/Pegasus-Utils)
[![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)](https://kotlinlang.org)
[![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)](https://developer.android.com)

Production-ready **Android utility library** — Kotlin extensions and helpers for bitmaps, files, dates, coroutines, encryption, permissions, screens, settings, and validation.

**Author:** [Sohaib Ahmed](https://github.com/itssohaibahmed)

Also published as [`epegasus/Pegasus-Utils`](https://jitpack.io/#epegasus/Pegasus-Utils) on JitPack.

---

## Modules

| Module | Utilities |
|--------|-----------|
| **PegasusBitmapUtils** | Bitmap scaling, compression, transformations |
| **PegasusFileUtils** | File I/O, paths, sharing |
| **PegasusDateUtils** | Date/time formatting |
| **PegasusHelperUtils** | General Android helpers |
| **PegasusCoroutineUtils** | Coroutine scopes and dispatchers |
| **PegasusEncryptionUtils** | Encryption / hashing helpers |
| **PegasusScreenUtils** | Display metrics, screen info |
| **PegasusSettingUtils** | Settings and preferences |
| **PegasusValidationUtils** | Input validation |

---

## Installation

### 1. Add JitPack repository

In `settings.gradle.kts` (or project `build.gradle`):

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

### 2. Add dependency

```kotlin
dependencies {
    implementation("com.github.itssohaibahmed:Pegasus-Utils:TAG")
}
```

Replace `TAG` with a [release tag](https://github.com/itssohaibahmed/Pegasus-Utils/releases).

---

## Development

```bash
git clone https://github.com/itssohaibahmed/Pegasus-Utils.git
```

- `pegutils/` — library module  
- `app/` — demo / integration sample

Open in Android Studio and publish via JitPack from tagged releases.

---

## Contributing

Issues and PRs welcome. Keep utilities focused, well-tested, and backward-compatible.

---

## License

See repository license terms. Contact maintainer for commercial use questions.
